package fr.gtm.pb_v4_avo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gtm.pb_v4_avo.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
