package org.jxapi.exchanges.kucoin.net;

import java.util.Map;

import org.jxapi.exchanges.kucoin.gen.KucoinConstants;
import org.jxapi.exchanges.kucoin.gen.KucoinExchange;
import org.jxapi.exchanges.kucoin.gen.KucoinProperties;
import org.jxapi.netutils.rest.ratelimits.RateLimitRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KucoinRateLimitsUtil {
  
  private static final Logger log = LoggerFactory.getLogger(KucoinRateLimitsUtil.class);
  
  private static String configureRateLimit(RateLimitRule rateLimit, String vipLevel, String resourcePool) {
    Map<String, Integer> quotas = KucoinConstants.RateLimits.QUOTAS.get(vipLevel);
    if (quotas == null) {
      throw new IllegalArgumentException("Invalid VIP level: " + vipLevel);
    }
    Integer quota = quotas.get(resourcePool);
    Long interval = KucoinConstants.RateLimits.TIME_INTERVAL;
    rateLimit.setMaxTotalWeight(quotas.get(resourcePool));
    rateLimit.setTimeFrame(interval);
    return String.format("%s: %d/%dms", resourcePool, quota, interval);
  }

  private KucoinRateLimitsUtil() {}
  
  public static void configureRateLimits(KucoinExchange exchange) {
    String vipLevel = KucoinProperties.getVipLevel(exchange.getProperties());
    StringBuilder sb = new StringBuilder()
        .append("Configuring Kucoin REST rate limits V2 for VIP Level: ")
        .append(vipLevel).append(":")
        .append(configureRateLimit(
            exchange.getSpotRateLimit(), 
            vipLevel, 
            KucoinConstants.RateLimits.ResourcePools.SPOT))
        .append(", ")
        .append(configureRateLimit(
            exchange.getFuturesRateLimit(), 
            vipLevel, 
            KucoinConstants.RateLimits.ResourcePools.FUTURES))
        .append(", ")
        .append(configureRateLimit(
            exchange.getManagementRateLimit(), 
            vipLevel, 
            KucoinConstants.RateLimits.ResourcePools.MANAGEMENT))
        .append(", ")
        .append(configureRateLimit(
            exchange.getPublicRateLimit(), 
            vipLevel, 
            KucoinConstants.RateLimits.ResourcePools.PUBLIC))
        .append(", ")
        .append(configureRateLimit(
            exchange.getEarnRateLimit(), 
            vipLevel, 
            KucoinConstants.RateLimits.ResourcePools.EARN))
        .append(", ")
        .append(configureRateLimit(
            exchange.getEarnRateLimit(), 
            vipLevel, 
            KucoinConstants.RateLimits.ResourcePools.COPY_TRADING))
    ;
    if (log.isInfoEnabled()) {
      log.info(sb.toString());
    }
  }

}
