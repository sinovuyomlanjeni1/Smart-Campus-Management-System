package repostories.inmemory;

import models.UserAccount;
import repositories.UserAccountRepository;

import java.util.*;

public class InMemoryUserAccountRepository implements UserAccountRepository {
    private final Map<String, UserAccount> storage = new HashMap<>();

    @Override
    public void save(UserAccount entity) {
        storage.put(entity.getUserId(), entity);
    }

    @Override
    public Optional<UserAccount> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<UserAccount> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(ID id) {
        storage.remove(id);
    }
}

