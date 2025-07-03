package com.cobeliii;

public class ShoppingCostCalculator {
    public double calculate(double weightKg, String region, boolean express){
        if (weightKg > 0 && weightKg < 1 && !express){
            return 5.00;
        }

        if(region.equals("Local")){
            if(!express && weightKg > 1.0){
                return 10.00;
            }
        }

        if(region.equals("International")){
            if(!express && weightKg > 1.0){
                return 20.00;
            }
        }

        if(region.equals("Local")){
            if(express && weightKg < 1.0){
                return 20.00;
            }
        }
        return 0.0;
    }
}
