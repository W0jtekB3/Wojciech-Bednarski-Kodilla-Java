package strategy.predictors;

import strategy.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}