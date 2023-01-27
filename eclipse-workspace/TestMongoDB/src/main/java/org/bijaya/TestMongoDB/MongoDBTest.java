package org.bijaya.TestMongoDB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;
public class MongoDBTest {
public static void main(String[] args) {
	//mongodb://123kishor:@dev.jferq.mongodb.net/<dbname>?retryWrites=true&w=majority
	

MongoClientURI uri = new MongoClientURI(
    "mongodb://123kishor:123bhatta@dev.jferq.mongodb.net/sample_analytics?retryWrites=true&w=majority");
//mongodb+srv://123kishor:123bhatta@dev.jferq.mongodb.net/sample_airbnb?retryWrites=true&w=majority
	
//&connectTimeoutMS=300000&socketTimeoutMS=300000

try {
	MongoClient mongoClient = new MongoClient(uri);

	MongoDatabase database = mongoClient.getDatabase("sample_analytics");
	
    MongoCollection<Document> collection = database.getCollection("accounts");

	try (MongoCursor<Document> cur = collection.find().iterator()) {

        while (cur.hasNext()) {

        	Document doc = cur.next();
           // List<Document> cars = new ArrayList<>(doc.values()).get(1);

            System.out.printf("%s: %s%n", new ArrayList<>(doc.values()).get(1), new ArrayList<>(doc.values()).get(2));
        }
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	//MongoCollection<Document> collection = database.getCollection("listingsAndReviews");
	//Document query = new Document("_id", new ObjectId("10009999"));
    //Document result = collection.find(query).iterator().next();

    //System.out.println("Test3: "+result.getString("space"));
	System.out.println("yes");
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}



	//---------- Connecting DataBase -------------------------//  
	
}
}
