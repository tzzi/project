package mvc.service;

import java.util.UUID;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class JoinService {
	@Autowired
	JavaMailSender sender;
	/*
	 * 특정 이메일 주소로 인증키를 보내는 기능을 만들꺼임.
	 * java mail api를 쓰면 메일보낼수 있음.
	 */
	
	public boolean sendAuthKey(String email) {
		String[] uuids = UUID.randomUUID().toString().split("-");
		String key = uuids[0]+"-"+uuids[1];
		MimeMessage message = sender.createMimeMessage();
		try {
			//message.setContent("content-type", "text/html;charset=utf-8");
			message.addRecipients(RecipientType.TO, email);
			message.setSubject("인증키입니다.");
			message.setText("아래 인증키를 입력해주세요.\n"+key, "UTF-8");
			
			sender.send(message);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
}
