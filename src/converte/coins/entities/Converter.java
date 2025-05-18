package converte.coins.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {
    private static final ConsultApi CONSULT_API = new ConsultApi();
    private String base;
    private String destiny;

    public Converter(String base, String destiny) {
        this.base = base;
        this.destiny = destiny;
    }

    public double ConverterValue(double quantity) {
        double value = CONSULT_API.getQuotation(base, destiny);
        if(value != -1){
            BigDecimal valueConverter = BigDecimal.valueOf(quantity * value);
            valueConverter = valueConverter.setScale(2, RoundingMode.HALF_UP);
            return valueConverter.doubleValue();
        }
        System.out.println("Valor nao encontrado");
        return 0;
    }
}
