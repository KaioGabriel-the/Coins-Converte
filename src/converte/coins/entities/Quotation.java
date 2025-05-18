package converte.coins.entities;

import java.util.Map;

public record Quotation(Map<String, Double> conversion_rates) { }
