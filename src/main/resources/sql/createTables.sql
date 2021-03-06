DROP TABLE IF EXISTS MANUFACTURER;
CREATE TABLE MANUFACTURER
(
  ID   int AUTO_INCREMENT PRIMARY KEY NOT NULL,
  NAME varchar(100) unique            not null,
  SITE varchar(200)
);

DROP TABLE IF EXISTS TYPE;
CREATE TABLE TYPE
(
  ID   int AUTO_INCREMENT PRIMARY KEY NOT NULL,
  NAME varchar(100) unique            not null
);


DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM
(
  ID                int AUTO_INCREMENT PRIMARY KEY NOT NULL,
  NAME              varchar(100)                   not null,
  MANUFACTURER_ID   int                            not null,
  TYPE_ID           int                            not null,
  CUSTOM_CODE       varchar(50),
  MMK_CODE          varchar(50),
  DESCRIPTION       varchar(2000),
  UNIT              varchar(20),
  QUANTITY_PER_UNIT int,
  MIN_UNITS         int,
  MEDIUM_UNITS      int,
  MANY_UNITS        int,
  CONSTRAINT FK9G6SG53KP04WQMER0N4KGWT5G FOREIGN KEY (MANUFACTURER_ID) REFERENCES MANUFACTURER (ID),
  CONSTRAINT FK4DPY5GBHXUO6GY19KPJGCQ66 FOREIGN KEY (TYPE_ID) REFERENCES TYPE (ID)
);


DROP TABLE IF EXISTS STOCKROOM;
CREATE TABLE STOCKROOM
(
  ID          int AUTO_INCREMENT PRIMARY KEY NOT NULL,
  NAME        varchar(255),
  DESCRIPTION varchar(2000)
);

DROP TABLE IF EXISTS RACK;
CREATE TABLE RACK
(
  ID           bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,
  NAME         varchar(30),
  STOCKROOM_ID int                               not null,
  CONSTRAINT FKROKSWDAYPXTM2K6E93ODDQPUC FOREIGN KEY (STOCKROOM_ID) REFERENCES STOCKROOM (ID)
);

DROP TABLE IF EXISTS RACK_ITEM;
CREATE TABLE RACK_ITEM
(
  ID       int AUTO_INCREMENT PRIMARY KEY NOT NULL,
  QUANTITY int                            NOT NULL,
  ITEM_ID  int                            not null,
  RACK_ID  int                            not null,
  CONSTRAINT FK9G6SG53KP04WQMER0N4KGWC5G FOREIGN KEY (ITEM_ID) REFERENCES ITEM (ID),
  CONSTRAINT FK4DPY5GBHXUO6GY19KPJGCV66 FOREIGN KEY (RACK_ID) REFERENCES RACK (ID)
)