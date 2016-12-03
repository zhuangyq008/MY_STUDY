package cn.nubia.mnt.dao;

import cn.nubia.mnt.model.Person;

public interface PersonDao {
    public Person fetchPerson( Integer personID );
    public void update( Person person );
}
