package codeWars;

import java.util.List;

public class Metro {
  public static int countPassengers(List<int[]> stops) {
    return stops.stream()
      .map(stop -> stop[0] - stop[1])
      .reduce(0, (subtotal, element) -> subtotal + element);
  }
}
