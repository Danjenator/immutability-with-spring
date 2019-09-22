package com.danjenator.immutabilitywithspring.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FooRepository extends MongoRepository<Foo, String> {
}
