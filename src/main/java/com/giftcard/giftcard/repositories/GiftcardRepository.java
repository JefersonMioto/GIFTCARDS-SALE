package com.giftcard.giftcard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giftcard.giftcard.models.GiftcardModel;

public interface GiftcardRepository extends JpaRepository<GiftcardModel, Long> {

}
