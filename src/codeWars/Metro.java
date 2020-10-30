package codeWars;

import java.util.List;

public class Metro {
  public static int countPassengers(List<int[]> stops) {
    return stops.stream()
      .mapToInt(stop -> stop[0] - stop[1])
      .sum();
  }
}
