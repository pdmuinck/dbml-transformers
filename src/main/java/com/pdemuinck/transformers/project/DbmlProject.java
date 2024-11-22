package com.pdemuinck.transformers.project;

import java.util.Objects;

public class DbmlProject {
    public String name;
    public String databaseType;
    public String note;

    public DbmlProject(){}

    public DbmlProject(String name, String databaseType, String note) {
        this.name = name;
        this.databaseType = databaseType;
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DbmlProject that = (DbmlProject) o;
        return Objects.equals(name, that.name) && Objects.equals(databaseType, that.databaseType) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, databaseType, note);
    }
}
