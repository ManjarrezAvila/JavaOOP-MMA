package model;

import java.util.Date;

interface ISchedulable {

    void schedule(Date date, String time);
}