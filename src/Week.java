public enum Week {
    MONDAY("Дуйшөмбү куну жава окуйм"),
    TUESDAY("Шейшемби куну жава окуйм"),
    WEDNESDAY("Шаршемби куну english окуйм"),
    THURSDAY("Бейшемби куну жава окуйм"),
    FRIDAY("Жума куну siro окуйм"),
    SATURDAY("Ишемби куну япон тилин окуйм"),
    SUNDAY("Жекшемби куну япон тилин окуйм");
    String description;

    Week(String description) {
        this.description = description;
    }


    public String getDescription(){
        return description;
    }
}

