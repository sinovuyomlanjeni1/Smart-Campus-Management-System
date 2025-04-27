package repostories.database;

import models.UserAccount;
import repositories.UserAccountRepository;

import java.util.List;
import java.util.Optional;
public class DatabaseUserAccountRepository implements UserAccountRepository {

    @Override
    public void save(UserAccount entity) {
        // TODO: Implement database save logic
    }

    @Override
    public Optional<UserAccount> findById(String id) {
        // TODO: Implement database find logic
        return Optional.empty();
    }

    @Override
    public List<UserAccount> findAll() {
        // TODO: Implement database find all
        return List.of();
    }

    @Override
    public void delete(String id) {
        // TODO: Implement database delete
    }
}