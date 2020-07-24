package seciont14.billing.step02;


import seciont14.time.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
