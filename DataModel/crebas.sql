/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/10/22 18:24:51                          */
/*==============================================================*/


drop table if exists balance;

drop table if exists customer;

drop table if exists flight;

drop table if exists flightorder;

drop table if exists refund;

/*==============================================================*/
/* Table: balance                                               */
/*==============================================================*/
create table balance
(
   balanceid            varchar(32) not null,
   customerid           varchar(32),
   balance_value        int,
   primary key (balanceid)
);

/*==============================================================*/
/* Table: customer                                              */
/*==============================================================*/
create table customer
(
   customerid           varchar(32) not null,
   username             varchar(32),
   password             varchar(32),
   mobile               varchar(12),
   email                varchar(32),
   primary key (customerid)
);

/*==============================================================*/
/* Table: flight                                                */
/*==============================================================*/
create table flight
(
   flightid             varchar(32) not null,
   airline              varchar(32),
   flightnumber         varchar(32),
   departure_time       datetime,
   arrival_time         datetime,
   departure_city       varchar(32),
   arrival_city         varchar(32),
   air_fare             int,
   primary key (flightid)
);

/*==============================================================*/
/* Table: flightorder                                           */
/*==============================================================*/
create table flightorder
(
   flight_order         varchar(32) not null,
   flightid             varchar(32),
   customerid           varchar(32),
   primary key (flight_order)
);

/*==============================================================*/
/* Table: refund                                                */
/*==============================================================*/
create table refund
(
   refuncid             varchar(32) not null,
   customerid           varchar(32),
   flightid             varchar(32),
   primary key (refuncid)
);

alter table balance add constraint FK_Reference_3 foreign key (customerid)
      references customer (customerid) on delete restrict on update restrict;

alter table flightorder add constraint FK_Reference_1 foreign key (flightid)
      references flight (flightid) on delete restrict on update restrict;

alter table flightorder add constraint FK_Reference_2 foreign key (customerid)
      references customer (customerid) on delete restrict on update restrict;

alter table refund add constraint FK_Reference_4 foreign key (customerid)
      references customer (customerid) on delete restrict on update restrict;

alter table refund add constraint FK_Reference_5 foreign key (flightid)
      references flight (flightid) on delete restrict on update restrict;

