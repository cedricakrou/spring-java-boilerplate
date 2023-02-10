package com.cedricakrou.springjavaboilerplate.generic.event;

/**
 * <p>Event sourcing Manager.
 * @param <P> payload of event.
 * @author KAKOU Akrou Cedric 2023-01-26
 */
public interface EventManager<P extends EventPayload> {

  /**
   * <p>publish event.</p>
   *
   * @param payload payload of event.
   */
  void publish(P payload);
}
