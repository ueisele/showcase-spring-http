package net.uweeisele.web.delegate.config;

import net.uweeisele.web.delegate.support.metrics.MetricsTaskExecutorCustomizer;
import net.uweeisele.web.delegate.support.metrics.MicrometerSupport;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.boot.task.TaskExecutorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import static org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration.APPLICATION_TASK_EXECUTOR_BEAN_NAME;
import static org.springframework.scheduling.annotation.AsyncAnnotationBeanPostProcessor.DEFAULT_TASK_EXECUTOR_BEAN_NAME;

@EnableAsync
@Configuration(proxyBeanMethods = false)
public class TaskExecutionConfiguration {

    @Lazy
    @Bean
    public MetricsTaskExecutorCustomizer metricsTaskExecutorCustomizer(MeterRegistry meterRegistry, MetricsProperties properties) {
        return new MetricsTaskExecutorCustomizer(meterRegistry, "", MicrometerSupport.toMicrometerTags(properties.getTags()));
    }

    @Lazy
    @Bean(name = { APPLICATION_TASK_EXECUTOR_BEAN_NAME, DEFAULT_TASK_EXECUTOR_BEAN_NAME })
    public ThreadPoolTaskExecutor applicationTaskExecutor(TaskExecutorBuilder builder) {
        return builder
                .threadNamePrefix(APPLICATION_TASK_EXECUTOR_BEAN_NAME + "-")
                .build();
    }

}