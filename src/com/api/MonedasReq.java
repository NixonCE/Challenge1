package com.api;

import java.util.ArrayList;
import java.util.Map;

public record MonedasReq(String base_code, Map<String , Double> conversion_rates) {
}
