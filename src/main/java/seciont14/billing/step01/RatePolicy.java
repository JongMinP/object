package seciont14.billing.step01;


import seciont14.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
