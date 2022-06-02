package pl.retsuz.collections;

import pl.retsuz.currency.ICurrency;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDataCollection implements IDataCollection {
    List<ICurrency> curr;

    public CurrencyDataCollection(){
        curr = new ArrayList<>();
    }

    @Override
    public String ToString() {
        String napis = "Wszystkie waluty:\n\n";
        for(ICurrency cr: curr) {
            napis += cr.getName() + "  " + cr.getCode() + "  " + cr.getFactor() + " " + cr.getRate() + "\n";
        }
        return napis;
    }

    @Override
    public List<ICurrency> getCurrencyList() {
        return curr;
    }

    @Override
    public ICurrency getCurrencyByCode(ICurrency currency) {
        for (ICurrency x : curr)
            if (x.equals(currency))
                return x;
        return null;
    }
}
