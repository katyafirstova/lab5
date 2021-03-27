package core;

public enum CommandCollection {

    HELP("help", "справка по доступным командам"),
    INFO("info", "информация о коллекции"),
    SHOW("show", "вывод всех элементов коллекции в строковом представлении"),
    INSERT("insert", "добавление нового элемента с заданным ключом"),
    UPDATE_ID("update id", "обновление значения элемента коллекции, id которого равен заданному"),
    REMOVE_KEY("remove key", "удаление элемента из коллекции по ключу"),
    CLEAR("clear", "очистка коллекции"),
    SAVE("save", "сохранение коллекции в файл"),
    EXIT("exit", "завершение программы без сохранения в файл"),
    EXECUTE_SCRIPT("execute script", "считывание и исполнение скрипта из указанного файла"),
    REMOVE_GREATER("remove greater", "удаление из коллекции всех элементов, чье значение зарплаты превышает заданный"),
    REMOVE_LOWER("remove lower", "удаление из коллекции всех элементов, чье значение зарплаты меньше заданного"),
    HISTORY("history", "вывод последних 14 команд"),
    REMOVE_ALL_BY_END_DATE("removeEndDate", "удаление из коллекции всех элементов, значение поля " +
            "endDate которого эквивалентно заданному"),
    REMOVE_ALL_BY_START_DATE("removeStartDate", "удаление из коллекции элемента, " +
            "значение поля startDate которого эквивалентно заданному"),
    PRINT_FIELD_DESCENDING_END_DATE("printEndDate",  "вывод значения поля endDate всех элементов" +
            " в порядке убывания"),
    UNKNOWN("unknown command", "команда не найдена; help - справка по доступным командам");

    private String command;
    private String description;

    CommandCollection(String command, String description) {
        this.command = command;
        this.description = description;
    }


    public static CommandCollection fromCmd(String cmd) {
        for (CommandCollection s : CommandCollection.values()) {
            if (cmd != null && cmd.equals(s.getCommand())) {
                return s;
            }
        }
        return CommandCollection.UNKNOWN;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }
}
