package org.springframework.samples.petclinic.util;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;

public class OpenTelemetrySupport {
  static {
    OpenTelemetry openTelemetry = AutoConfiguredOpenTelemetrySdk.initialize().getOpenTelemetrySdk();

    tracer = openTelemetry.getTracer("io.opentelemetry-api", "1.26.0");
  }

  private static Tracer tracer;

  public static Tracer getTracer() {
    return tracer;
  }
}
