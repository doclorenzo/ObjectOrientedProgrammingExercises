package esercizi_collections.Set.ProjectManager;

import java.util.Objects;
import java.util.UUID;

public class Task {

    final UUID uuid;
    String description;
    Integer hoursNeeded;
    Employee teamLeader;
    Project project;

    public Task(String description, Integer hoursNeeded) {
        this.uuid = UUID.randomUUID();
        this.description = description;
        this.hoursNeeded = hoursNeeded;
    }

    public String getDescription() {
        return description;
    }

    public Integer getHoursNeeded() {
        return hoursNeeded;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHoursNeeded(Integer hoursNeeded) {
        this.hoursNeeded = hoursNeeded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(uuid, task.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(uuid);
    }

    @Override
    public String toString() {
        return "Task{" +
                "uuid=" + uuid +
                ", description='" + description + '\'' +
                ", hoursNeeded=" + hoursNeeded +
                '}';
    }

    public void setProject(Project project){
        this.project=project;
    }

    public void setTeamLeader(Employee teamLeader){
        this.teamLeader=teamLeader;
    }

    public Project getProject(){
        return this.project;
    }

    public Employee getTeamLeader(){
        return this.teamLeader;
    }

}
