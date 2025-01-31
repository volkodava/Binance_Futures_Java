package com.binance.client.model.event;

import com.binance.client.constant.BinanceApiConstants;
import com.binance.client.model.market.OrderBookEntry;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OrderBookEvent {

    private String eventType;

    private Long eventTime;

    private Long transactionTime;

    private String symbol;

    private Long firstUpdateId;

    private Long lastUpdateId;

    private Long lastUpdateIdInLastStream;

    private List<OrderBookEntry> bids;

    private List<OrderBookEntry> asks;

    private long createdAt;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public Long getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Long transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Long getFirstUpdateId() {
        return firstUpdateId;
    }

    public void setFirstUpdateId(Long firstUpdateId) {
        this.firstUpdateId = firstUpdateId;
    }

    public Long getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(Long lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public Long getLastUpdateIdInLastStream() {
        return lastUpdateIdInLastStream;
    }

    public void setLastUpdateIdInLastStream(Long lastUpdateIdInLastStream) {
        this.lastUpdateIdInLastStream = lastUpdateIdInLastStream;
    }

    public List<OrderBookEntry> getBids() {
        return bids;
    }

    public void setBids(List<OrderBookEntry> bids) {
        this.bids = bids;
    }

    public List<OrderBookEntry> getAsks() {
        return asks;
    }

    public void setAsks(List<OrderBookEntry> asks) {
        this.asks = asks;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("eventType", eventType)
            .append("eventTime", eventTime).append("transactionTime", transactionTime).append("symbol", symbol)
            .append("firstUpdateId", firstUpdateId).append("lastUpdateId", lastUpdateId)
            .append("lastUpdateIdInLastStream", lastUpdateIdInLastStream).append("bids", bids)
            .append("asks", asks).append("createdAt", createdAt)
            .toString();
    }
}
