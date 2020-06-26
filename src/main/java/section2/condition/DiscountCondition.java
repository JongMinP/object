package section2.condition;

import section2.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
