package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockDecreaed extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;

    public StockDecreaed(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecreaed() {
        super();
    }
}
//>>> DDD / Domain Event
