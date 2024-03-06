package com.kh.tcp;

import java.net.InetAddress;

/*
 * 여러대의 컴퓨터들이 연결되어 있는 통신망.
 * 네트워크를 통해서 서로 데이터를 교환하기 위해서.
 * 
 * IP 주소 : 네트워크상에 각 컴퓨터들을 식별해줄 수 있는 번호(실제 주소와 동일한 역할을 한다고 생각하면 된다.)
 * 
 * 서버와 클라이언트
 * 
 * 서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램 또는 컴퓨터 (클라이언트의 요청에 응답을 해주는 것)
 * 클라이언트 : 서버에 요청을 하는 컴퓨터 (서비스를 제공받는 고객)
 * 
 * 서버에 요청하기위해서는 그 요청하고자하는 서버에 IP 또는 도메인, 포트번호를 알아야함.
 *  
 */
//InetAddress : 네트워크의 정보를 가진 객체(IP주소 관련)를 확인 할 수 있는 클래스
public class Run {

	public static void main(String[] args) {
		//LocalHost = 자기 컴퓨터
		
		
		InetAddress localhost = new InetAddress.getLocalHost();
		
	}

}
