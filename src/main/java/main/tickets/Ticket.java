package main.tickets;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Ticket {

    private String origin;
    private String origin_name;
    private String destination;
    private String destination_name;
    private String departure_date;
    private String departure_time;
    private String arrival_date;
    private String arrival_time;
    private String carrier;
    private int stops;
    private int price;

    public Ticket(String origin, String origin_name, String destination, String destination_name, String departure_date,
                  String departure_time, String arrival_date, String arrival_time, String carrier, int stops, int price)
    {
        this.origin = origin;
        this.origin_name = origin_name;
        this.destination = destination;
        this.destination_name = destination_name;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.arrival_date = arrival_date;
        this.arrival_time = arrival_time;
        this.carrier = carrier;
        this.stops = stops;
        this.price = price;
    }
    public long getDuration() {

        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd.MM.yyH:mm");

        LocalDateTime departure = LocalDateTime.parse(departure_date + departure_time, format);
        LocalDateTime arrival = LocalDateTime.parse(arrival_date + arrival_time, format);

        return ChronoUnit.MINUTES.between(departure,arrival);

    }

    public String getOrigin() {return origin;}

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginName() {
        return origin_name;
    }

    public void setOriginName(String originName) {
        this.origin_name = originName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationName() {
        return destination_name;
    }

    public void setDestinationName(String destinationName) {
        this.destination_name = destinationName;
    }

    public String getDepartureDate() { return departure_date;}

    public void setDepartureDate(String departureDate) {
        this.departure_date = departureDate;
    }

    public String getDepartureTime() {
        return departure_time;
    }

    public void setDepartureTime(String departureTime) {
        this.departure_time = departureTime;
    }

    public String getArrival_date() { return arrival_date; }

    public void setArrival_date(String arrival_date) { this.arrival_date = arrival_date;}

    public String  getArrival_time() { return arrival_time;}

    public void setArrival_time(String arrival_time) {this.arrival_time = arrival_time;}

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "origin= " + origin +" originName= " + origin_name +
                " destination= " + destination +
                " destinationName= " + destination_name +
                " departureDate= " + departure_date +
                " departureTime= " + departure_time +
                " arrivalDate= " + arrival_date +
                " arrivalTime= " + arrival_time +
                " carrier= " + carrier +
                " stops= " + stops +
                " price= " + price +
                '}'+"time="+getDuration()+'\n';
    }
}
