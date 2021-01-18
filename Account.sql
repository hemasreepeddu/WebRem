create table TBL_Accounts_1334828(
accountno number(8) primary key,
accountholder varchar2(50) not null,
balance number(12,2) not null,
branch varchar2(50) not null,
status varchar2(20) not null
);
insert into TBL_Accounts_1334828 values(101,'surekha',30000,'hyd','active');
insert into TBL_Accounts_1334828 values(102,'karthik',40000,'hyd','active');
insert into TBL_Accounts_1334828 values(103,'chinnu',50000,'hyd','inactive');
insert into TBL_Accounts_1334828 values(104,'bittu',60000,'hyd','inactive');
drop table TBL_Accounts_1334828;
select * from TBL_Accounts_1334828;
