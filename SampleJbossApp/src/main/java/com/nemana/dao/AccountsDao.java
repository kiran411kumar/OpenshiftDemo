package com.nemana.dao;

import com.nemana.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsDao extends JpaRepository<Accounts, Integer> {
}
