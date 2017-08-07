drop table if exists grid;
drop table if exists users;

create table grid (
  id integer primary key autoincrement,
  x integer not null,
  y integer not null,
  owner integer
);

create table users (
  id integer primary key autoincrement,
  name text not null
);