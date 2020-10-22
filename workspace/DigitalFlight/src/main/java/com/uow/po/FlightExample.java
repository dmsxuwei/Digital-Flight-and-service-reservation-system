package com.uow.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFlightidIsNull() {
            addCriterion("flightid is null");
            return (Criteria) this;
        }

        public Criteria andFlightidIsNotNull() {
            addCriterion("flightid is not null");
            return (Criteria) this;
        }

        public Criteria andFlightidEqualTo(String value) {
            addCriterion("flightid =", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotEqualTo(String value) {
            addCriterion("flightid <>", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThan(String value) {
            addCriterion("flightid >", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThanOrEqualTo(String value) {
            addCriterion("flightid >=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThan(String value) {
            addCriterion("flightid <", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThanOrEqualTo(String value) {
            addCriterion("flightid <=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLike(String value) {
            addCriterion("flightid like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotLike(String value) {
            addCriterion("flightid not like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidIn(List<String> values) {
            addCriterion("flightid in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotIn(List<String> values) {
            addCriterion("flightid not in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidBetween(String value1, String value2) {
            addCriterion("flightid between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotBetween(String value1, String value2) {
            addCriterion("flightid not between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andAirlineIsNull() {
            addCriterion("airline is null");
            return (Criteria) this;
        }

        public Criteria andAirlineIsNotNull() {
            addCriterion("airline is not null");
            return (Criteria) this;
        }

        public Criteria andAirlineEqualTo(String value) {
            addCriterion("airline =", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineNotEqualTo(String value) {
            addCriterion("airline <>", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineGreaterThan(String value) {
            addCriterion("airline >", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineGreaterThanOrEqualTo(String value) {
            addCriterion("airline >=", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineLessThan(String value) {
            addCriterion("airline <", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineLessThanOrEqualTo(String value) {
            addCriterion("airline <=", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineLike(String value) {
            addCriterion("airline like", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineNotLike(String value) {
            addCriterion("airline not like", value, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineIn(List<String> values) {
            addCriterion("airline in", values, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineNotIn(List<String> values) {
            addCriterion("airline not in", values, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineBetween(String value1, String value2) {
            addCriterion("airline between", value1, value2, "airline");
            return (Criteria) this;
        }

        public Criteria andAirlineNotBetween(String value1, String value2) {
            addCriterion("airline not between", value1, value2, "airline");
            return (Criteria) this;
        }

        public Criteria andFlightnumberIsNull() {
            addCriterion("flightnumber is null");
            return (Criteria) this;
        }

        public Criteria andFlightnumberIsNotNull() {
            addCriterion("flightnumber is not null");
            return (Criteria) this;
        }

        public Criteria andFlightnumberEqualTo(String value) {
            addCriterion("flightnumber =", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberNotEqualTo(String value) {
            addCriterion("flightnumber <>", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberGreaterThan(String value) {
            addCriterion("flightnumber >", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberGreaterThanOrEqualTo(String value) {
            addCriterion("flightnumber >=", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberLessThan(String value) {
            addCriterion("flightnumber <", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberLessThanOrEqualTo(String value) {
            addCriterion("flightnumber <=", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberLike(String value) {
            addCriterion("flightnumber like", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberNotLike(String value) {
            addCriterion("flightnumber not like", value, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberIn(List<String> values) {
            addCriterion("flightnumber in", values, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberNotIn(List<String> values) {
            addCriterion("flightnumber not in", values, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberBetween(String value1, String value2) {
            addCriterion("flightnumber between", value1, value2, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andFlightnumberNotBetween(String value1, String value2) {
            addCriterion("flightnumber not between", value1, value2, "flightnumber");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNull() {
            addCriterion("departure_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNotNull() {
            addCriterion("departure_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeEqualTo(Date value) {
            addCriterion("departure_time =", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotEqualTo(Date value) {
            addCriterion("departure_time <>", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThan(Date value) {
            addCriterion("departure_time >", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("departure_time >=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThan(Date value) {
            addCriterion("departure_time <", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThanOrEqualTo(Date value) {
            addCriterion("departure_time <=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIn(List<Date> values) {
            addCriterion("departure_time in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotIn(List<Date> values) {
            addCriterion("departure_time not in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeBetween(Date value1, Date value2) {
            addCriterion("departure_time between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotBetween(Date value1, Date value2) {
            addCriterion("departure_time not between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(Date value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(Date value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(Date value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(Date value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<Date> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<Date> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIsNull() {
            addCriterion("departure_city is null");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIsNotNull() {
            addCriterion("departure_city is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureCityEqualTo(String value) {
            addCriterion("departure_city =", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotEqualTo(String value) {
            addCriterion("departure_city <>", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityGreaterThan(String value) {
            addCriterion("departure_city >", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityGreaterThanOrEqualTo(String value) {
            addCriterion("departure_city >=", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLessThan(String value) {
            addCriterion("departure_city <", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLessThanOrEqualTo(String value) {
            addCriterion("departure_city <=", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLike(String value) {
            addCriterion("departure_city like", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotLike(String value) {
            addCriterion("departure_city not like", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIn(List<String> values) {
            addCriterion("departure_city in", values, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotIn(List<String> values) {
            addCriterion("departure_city not in", values, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityBetween(String value1, String value2) {
            addCriterion("departure_city between", value1, value2, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotBetween(String value1, String value2) {
            addCriterion("departure_city not between", value1, value2, "departureCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityIsNull() {
            addCriterion("arrival_city is null");
            return (Criteria) this;
        }

        public Criteria andArrivalCityIsNotNull() {
            addCriterion("arrival_city is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalCityEqualTo(String value) {
            addCriterion("arrival_city =", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityNotEqualTo(String value) {
            addCriterion("arrival_city <>", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityGreaterThan(String value) {
            addCriterion("arrival_city >", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_city >=", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityLessThan(String value) {
            addCriterion("arrival_city <", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityLessThanOrEqualTo(String value) {
            addCriterion("arrival_city <=", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityLike(String value) {
            addCriterion("arrival_city like", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityNotLike(String value) {
            addCriterion("arrival_city not like", value, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityIn(List<String> values) {
            addCriterion("arrival_city in", values, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityNotIn(List<String> values) {
            addCriterion("arrival_city not in", values, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityBetween(String value1, String value2) {
            addCriterion("arrival_city between", value1, value2, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andArrivalCityNotBetween(String value1, String value2) {
            addCriterion("arrival_city not between", value1, value2, "arrivalCity");
            return (Criteria) this;
        }

        public Criteria andAirFareIsNull() {
            addCriterion("air_fare is null");
            return (Criteria) this;
        }

        public Criteria andAirFareIsNotNull() {
            addCriterion("air_fare is not null");
            return (Criteria) this;
        }

        public Criteria andAirFareEqualTo(Integer value) {
            addCriterion("air_fare =", value, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareNotEqualTo(Integer value) {
            addCriterion("air_fare <>", value, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareGreaterThan(Integer value) {
            addCriterion("air_fare >", value, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_fare >=", value, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareLessThan(Integer value) {
            addCriterion("air_fare <", value, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareLessThanOrEqualTo(Integer value) {
            addCriterion("air_fare <=", value, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareIn(List<Integer> values) {
            addCriterion("air_fare in", values, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareNotIn(List<Integer> values) {
            addCriterion("air_fare not in", values, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareBetween(Integer value1, Integer value2) {
            addCriterion("air_fare between", value1, value2, "airFare");
            return (Criteria) this;
        }

        public Criteria andAirFareNotBetween(Integer value1, Integer value2) {
            addCriterion("air_fare not between", value1, value2, "airFare");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}