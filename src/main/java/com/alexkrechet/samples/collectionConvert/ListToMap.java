package com.alexkrechet.samples.collectionConvert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] arg) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Marta", 21));
        users.add(new User(2, "Alex", 17));
        users.add(new User(3, "James", 25));
        users.add(new User(4, "Alex", 31));
        users.add(new User(5, "James", 19));
        users.add(new User(6, "Marta", 27));
        users.add(new User(7, "Alex", 29));

        Map<String, List<User>> userGroups = users.stream().collect(Collectors.groupingBy(User::getName));
        System.out.println(userGroups.size());
        System.out.println(userGroups.values());
    }
}
