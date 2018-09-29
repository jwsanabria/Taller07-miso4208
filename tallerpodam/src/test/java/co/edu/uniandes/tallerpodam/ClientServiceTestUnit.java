/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.tallerpodam;

import co.edu.uniandes.tallerpodam.model.Book;
import co.edu.uniandes.tallerpodam.model.User;
import co.edu.uniandes.tallerpodam.service.BookService;
import co.edu.uniandes.tallerpodam.service.UserService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import org.junit.Assert;

/**
 *
 * @author John_Sanabria
 */
public class ClientServiceTestUnit {

    public ClientServiceTestUnit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testUserService() throws Exception {


            UserService userService = new UserService();
            PodamFactory factory = new PodamFactoryImpl();
            User newEntity = factory.manufacturePojo(User.class);
            userService.persist(newEntity);

            User entity = userService.findById(newEntity.getUserid());
            
            Assert.assertNotNull(entity);

            Assert.assertEquals(newEntity.getCreatedDate().getDay(), entity.getCreatedDate().getDay());
            Assert.assertEquals(newEntity.getCreatedDate().getMonth(), entity.getCreatedDate().getMonth());
            Assert.assertEquals(newEntity.getCreatedDate().getYear(), entity.getCreatedDate().getYear());
            Assert.assertEquals(newEntity.getCreatedBy(), entity.getCreatedBy());
            Assert.assertEquals(newEntity.getUserid(), entity.getUserid());
            Assert.assertEquals(newEntity.getUsername(), entity.getUsername());
          
    }
    
    
    @Test
    public void testBookService() throws Exception {


            BookService service = new BookService();
            PodamFactory factory = new PodamFactoryImpl();
            Book newEntity = factory.manufacturePojo(Book.class);
            service.persist(newEntity);

            Book entity = service.findById(newEntity.getId());
            
            Assert.assertNotNull(entity);

            
          
    }
}
