package com.dsa2024.javaqa.interviews_qa;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public final class ImmutableClass {

    private final Integer id;
    private final String name;
    private final List<String> friendList;

    public ImmutableClass(Integer id, String name, List<String> friendList) {
        this.id = id;
        this.name = name;
        // Defensive copy
        this.friendList = new ArrayList<>(friendList);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getFriendList() {
        // Return unmodifiable copy
        return Collections.unmodifiableList(friendList);
    }

    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        friends.add("Amit");
        ImmutableClass obj = new ImmutableClass(1, "Rahul", friends);
        obj.getFriendList().add("Narendra");
    }
}
