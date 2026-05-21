// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BstTimeToBuyNSellStock {
    public int maxProfit(int[] prices) {

        ArrayList<Integer> priceList = Arrays.stream(prices)
                .boxed() // Converts int to Integer
                .collect(Collectors.toCollection(ArrayList::new));

        // find index of smallest number
        int minPrice = Collections.min(priceList);
        int indexOfMin = priceList.indexOf(minPrice);

        // Split list from smallest number
        List<Integer> profits = priceList.subList(indexOfMin, priceList.size());

        // Find largest num in profits list
        int maxProfit = Collections.max(profits);
        
        if (maxProfit <= minPrice) return 0;
        return maxProfit-minPrice;
    }
}
