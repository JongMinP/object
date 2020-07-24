package seciont14.billing.step02;


import seciont14.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
