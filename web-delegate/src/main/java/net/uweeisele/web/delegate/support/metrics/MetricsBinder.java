package net.uweeisele.web.delegate.support.metrics;

public interface MetricsBinder<T> {

    void monitor(T target, String targetName);
}
