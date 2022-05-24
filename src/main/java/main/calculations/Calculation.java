package main.calculations;

import main.tickets.Ticket;
import main.tickets.Tickets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculation {

    public String avgTime(Tickets tickets) {
        List <Ticket> list = tickets.getTickets();
        long avgDur = 0;
        for (int i=0; list.size()>i;i++ ){

            avgDur = avgDur + list.get(i).getDuration();
        }
        avgDur = avgDur/list.size();
        long hours = avgDur/60;
        double minutes =(double) avgDur%60;
        String avgTime ="Среднее время полета между городами Владивосток и Тель-Авив: \n"+hours+" часов "+ minutes + " минут";
        return avgTime;
    }

    public String percentile(Tickets tickets){
        List <Ticket> list = tickets.getTickets();
         double percentile =  0.9*list.size();
        List<Long> values = new ArrayList<>();

        for (int i=0;list.size()>i;i++){
            values.add(i,list.get(i).getDuration());
        }
            Collections.sort(values);
        int position =(int) Math.ceil(percentile) - 1;

         long hours = list.get(position).getDuration()/60;
         double minutes = list.get(position).getDuration()%60;
        return "90-й процентиль времени полета между городами Владивосток и Тель-Авив: \n"
                +hours+" часов "+ minutes + " минут ";
    }

}
