package com.shop.persistence;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shop.domain.Shop;
import com.shop.utilities.InvalidParamException;
@Repository
public class ShopRepository {

	/*private static Datastore datastore = DatastoreManager.getInstance().getDatastore();*/

	private static List<Shop> shops = new ArrayList<>();

	public ShopRepository() {
	}


	public void addShop(Shop shop) throws InvalidParamException {
		if (shop == null)
			throw new InvalidParamException();
		try {
			shops.add(shop);
		} catch (Exception e) {
			throw new InvalidParamException();
		}
	}

//	public List<Shop> getAllShops() {
//		return new ArrayList<>(shops);
//	}

	public List<Shop> getAllShops() {
		List<Shop> result = new ArrayList<>();
		for (Shop shop : shops) {
			result.add(shop);
		}
		return result;
	}

	public Shop getShopById(int shopID) throws Exception {
		for (Shop shop : shops) {
			if (shop.getId().equals(shopID)) {
				return shop;
			}
		}
		throw new Exception();
	}

//	public boolean shopExistById(Shop shop) {
//		for (Shop s : shops) {
//			if (s.getId().equals(shop.getId()))
//				return true;
//		}
//		return false;
//	}

}
