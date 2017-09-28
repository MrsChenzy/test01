package com.loveartcn.edas.hsf.detail;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.loveartcn.edas.hsf.itemcenter.Item;
import com.loveartcn.edas.hsf.itemcenter.ItemService;

/**
 * 消费订阅服务
 * @author win-chen
 *
 */
public class StartListener implements ServletContextListener{

	public void contextInitialized( ServletContextEvent sce ) {
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext( sce.getServletContext() );
		final ItemService itemService = ( ItemService ) ctx.getBean( "item" );
		Thread thread = new Thread( new Runnable() {
			@Override
			public void run() {
				while ( true ) {
					try {
						Thread.sleep( 5000 );
						Item itemByName = itemService.getItemByName("");
						System.out.println("it:" + itemByName);
						System.out.println( itemService.getItemByName("尼桑") );
						System.out.println( "test" );
					} catch ( Throwable e ) {
						e.printStackTrace();
					}
				}
			}
		} );
		thread.start();
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
