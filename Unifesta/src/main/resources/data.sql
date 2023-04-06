
insert into User (username, password, email,sns) values
                    ('트럭173','123123','','kakao'),
                    ('클래식블루','123123','','kakao'),
                    ('유어스','123123','','google'),
                    ('회기아치','123123','','google'),
                    ('스랩조','123123','',''),
                    ('림만보','123123','',''),
                    ('하냥짱','123123','',''),
                    ('천십리','123123','',''),
                    ('신마카세','123123','',''),
                    ('김태헌','123123','taehuen7757@gmail.com',''),
                    ('나혜령','123123','skgPfud@gmail.com','')
;

insert into School (schoolName,festivalDescription, festivalPoster) values
                    ('건국대학교','2022 통합축제 녹색지대 ''綠色地帶'' : 멈춰있던 우리, 바로시작 REBOOT
                                2022 통합축제 녹색지대는 일감호 축전과 성신의 예술제를 통합 기획하여 더욱 더 큰 규모로 진행됩니다. 지금까지 건국대학교 축제의 명성에 걸맞은 다양한 체험 부스를 준비햇습니다. 또한 축제 분위기를 한껏 끌어올리기 위해 학교를 꾸밀 다양한 소품 또한 준비했으니 기대하셔도 좋습니다. 학우들의 아이디어를 모아 직접 운영하는 부스와 넘치는 끼와 재능을 펼칠 수 있는 무대까지, 녹색지대는 학우 여러분이 진정한 주인공이 되는, 건국대학교 모든 구성원들이 화합할 수 있는 무대가 될 것이라고 확신합니다. 더욱 새로워질, 더욱 활기 넘칠 건국대학교를 여러분의 초록빛으로 물들여주세요! 그럼 녹색지대에서 여러분을 기다리고 있겠습니다!'
                                ,'https://placeimg.com/100/140/nature'),
                    ('경희대학교','MASTERPEACE: Ready, Set, Play
                                이번 MASTERPEACE는 ''학창시절 운동회''를 컨셉으로 개최됩니다! 가을 MASTERPEACE에서 동심으로 돌아가 예쁜 추억 남기고 가시기 바랍니다!','https://placeimg.com/100/140/nature'),
                    ('한양대학교','애한제: ''한양으로 물들이다''라는 슬로건을 바탕으로 한양인이 만들어가는 가을 축제 애한제에 학우 여러분들의 많은 관심과 참여 부탁드립니다.','https://placeimg.com/100/140/nature'),
                    ('성균관대학교','애한제: ''한양으로 물들이다''라는 슬로건을 바탕으로 한양인이 만들어가는 가을 축제 애한제에 학우 여러분들의 많은 관심과 참여 부탁드립니다.','https://placeimg.com/100/140/nature'),
                    ('경북대학교','애한제: ''한양으로 물들이다''라는 슬로건을 바탕으로 한양인이 만들어가는 가을 축제 애한제에 학우 여러분들의 많은 관심과 참여 부탁드립니다.','https://placeimg.com/100/140/nature'),
                    ('부산대학교','애한제: ''한양으로 물들이다''라는 슬로건을 바탕으로 한양인이 만들어가는 가을 축제 애한제에 학우 여러분들의 많은 관심과 참여 부탁드립니다.','https://placeimg.com/100/140/nature'),
                    ('동아대학교','애한제: ''한양으로 물들이다''라는 슬로건을 바탕으로 한양인이 만들어가는 가을 축제 애한제에 학우 여러분들의 많은 관심과 참여 부탁드립니다.','https://placeimg.com/100/140/nature')
;

insert into UserSchool (USER_ID, SCHOOL_ID) values
                    (1,1),
                    (2,3),
                    (2,3),
                    (10,1),
                    (10,2)
;

insert into FestivalCalendar (addressName, eveningTime, morningTime, performanceTime, subway, totalDate, school) values
                    ('서울시 광진구 능동로 120','18:00 ~ 01:00','09:00 ~ 18:00','18:00 ~ ','2,7','2022.10.26(수)~28(금)',1),
                    ('서울특별시 동대문구 경희대로 26','18:00 ~ 23:00','10:00 ~ 17:00','18:00 ~ 22:00','1','2022.09.28(수)~30(금)',2),
                    ('서울특별시 성동구 왕십리로 222','18:00~24:00','10:00~17:00','16:00~22:00','2','2022.10.05(수)~7(금)',3)
;

insert into Celebrity (singerName, singerImage, totalLiked) values
                    ('10cm', 'https://placeimg.com/200/100/people', 12),
                    ('다이나믹듀오','https://placeimg.com/200/100/people',11),
                    ('ITZY','https://placeimg.com/200/100/people',14),
                    ('재만','https://placeimg.com/200/100/people',17),
                    ('규현','https://placeimg.com/200/100/people',23),
                    ('픽보이','https://placeimg.com/200/100/people',1),
                    ('타이거JK&윤미래&비지','https://placeimg.com/200/100/people',234),
                    ('JUN.K','https://placeimg.com/200/100/people',15),
                    ('잔나비','https://placeimg.com/200/100/people',41),
                    ('윤하','https://placeimg.com/200/100/people',123),
                    ('폴킴','https://placeimg.com/200/100/people',14),
                    ('경서','https://placeimg.com/200/100/people',12),
                    ('정유진','https://placeimg.com/200/100/people',15),
                    ('소수빈','https://placeimg.com/200/100/people',12),
                    ('크러쉬','https://placeimg.com/200/100/people',141),
                    ('홀리뱅','https://placeimg.com/200/100/people',12),
                    ('MVP','https://placeimg.com/200/100/people',1),
                    ('뉴진스','https://placeimg.com/200/100/people',3),
                    ('박재범','https://placeimg.com/200/100/people',400)

;

insert into SchoolCelebrity (CELEBRITY_ID, SCHOOL_ID) values
                    (1,2),
                    (2,2),
                    (3,2),
                    (4,2),
                    (5,2),
                    (6,2),
                    (7,2),
                    (8,2),
                    (9,2),
                    (10,2),
                    (11,2),
                    (12,2),
                    (13,2),
                    (1,3),
                    (14,3),
                    (7,3),
                    (3,3),
                    (15,3),
                    (16,1),
                    (17,1),
                    (18,1),
                    (19,1),
                    (9,1),
                    (2,1)
;

--insert into FestivalReview (SCHOOL_ID, USER_ID, reviewContent, likedCount, year) values
--                (1,1,'축제 라인업 실화냐 박재범 뉴진스 사랑해여ㅠㅠㅠㅠㅠ',31,'2022'),
--                (1,2,'외부인 대상으로도 팔찌 판매해서 좋았습니다 재밌게 놀다갑니다~!',19,'2022'),
--                (1,3,'예디대 주점 안주도 혜자고 재밌게 놀다왔습니다! 추천합니다!',8,'2021'),
--                (2,4,'있지 완전 예뻤어요!!!! 노래도 엄청 많이 불러주셨습니다>< 꿀잼',3,'2022'),
--                (2,5,'주점 대기시간은 길었는데 사용시간이 2시간씩 제한되어있네요ㅠ 아쉽습니다',5,'2022'),
--                (2,6,'인생네컷 찍을 수 있어서 넘 좋았어요!!ㅋㅋㅋ 푸드트럭도 꽤 많습니다',17,'2021'),
--                (3,7,'역대급으로 사람 많은 축제 같아요ㄷㄷㄷ 주점 길어서 술집갔습니다~',8,'2022'),
--                (3,8,'죽기 전에 싸이 콘서트 가보는게 소원이었습니다.. 그 소원을 오늘 풀었습..니다...',22,'2022'),
--                (3,9,'주점이랑 부스 엄청 많음 근데 웨이팅도 길긴함',2,'2021')
--;