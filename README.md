# SpringBootOnetoOneMapping
In this I have Worked on Spring Boot And Hibernate For one to One Mapping.
This Repository can be Used for one to one mapping using Spring Boot Jpa and Mysql.
In this one Entity class work as Parent and other one as child in which  we used @JoinColumn(name = "user_id", nullable = false)
is child. It worked as a foreign Key

alter table user_profile add constraint FKuganfwvnbll4kn2a3jeyxtyi foreign key (user_id) references users (id)
