insert into user_details(id, Name, DOB)
values(1001, 'Shreya', current_date());

insert into user_details(id, Name, DOB)
values(1002, 'Dinnu', current_date());

insert into user_details(id, Name, DOB)
values(1003, 'Jiju', current_date());

insert into post(id, description, user_id)
values(2001, 'Hello Neethu', 1001);

insert into post(id, description, user_id)
values(2002, 'Hello Dinnu', 1002);

insert into post(id, description, user_id)
values(2003, 'Hello World', 1001);