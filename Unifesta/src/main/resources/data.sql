
insert into User (username, password, email) values
                    ('김태헌','123123','taehuen7757@gmail.com'),
                    ('나혜령','123123','skgPfud@gmail.com')
;

insert into School (schoolName,festivalDescription, festivalPoster) values
                    ('건국대학교','2022 통합축제 녹색지대 ''綠色地帶'' : 멈춰있던 우리, 바로시작 REBOOT
                                2022 통합축제 녹색지대는 일감호 축전과 성신의 예술제를 통합 기획하여 더욱 더 큰 규모로 진행됩니다. 지금까지 건국대학교 축제의 명성에 걸맞은 다양한 체험 부스를 준비햇습니다. 또한 축제 분위기를 한껏 끌어올리기 위해 학교를 꾸밀 다양한 소품 또한 준비했으니 기대하셔도 좋습니다. 학우들의 아이디어를 모아 직접 운영하는 부스와 넘치는 끼와 재능을 펼칠 수 있는 무대까지, 녹색지대는 학우 여러분이 진정한 주인공이 되는, 건국대학교 모든 구성원들이 화합할 수 있는 무대가 될 것이라고 확신합니다. 더욱 새로워질, 더욱 활기 넘칠 건국대학교를 여러분의 초록빛으로 물들여주세요! 그럼 녹색지대에서 여러분을 기다리고 있겠습니다!',
                                'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.chugye.ac.kr%2Fmbs%2Fmobile%2Fjsp%2Fboard%2Fview_mobile.jsp%3FboardId%3D6784%26boardSeq%3D5212576%26boardType%3D01%26id%3Dmobile_030100000000&psig=AOvVaw32YnkjsoyB35si_BwGSz7j&ust=1676268527848000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJihiYOpj_0CFQAAAAAdAAAAABAR'),
                    ('경희대학교','MASTERPEACE: Ready, Set, Play
                                이번 MASTERPEACE는 ''학창시절 운동회''를 컨셉으로 개최됩니다! 가을 MASTERPEACE에서 동심으로 돌아가 예쁜 추억 남기고 가시기 바랍니다!',''),
                    ('한양대학교','애한제: ''한양으로 물들이다''라는 슬로건을 바탕으로 한양인이 만들어가는 가을 축제 애한제에 학우 여러분들의 많은 관심과 참여 부탁드립니다.','')
;

insert into UserSchool (USER_ID, SCHOOL_ID, likedCount) values
                    (1,1,0),
                    (2,3,0),
                    (2,3,0)
;

insert into FestivalCalendar (addressName, eveningTime, morningTime, performanceTime, subway, totalDate, school) values
                    ('서울시 광진구 능동로 120','18:00 ~ 01:00','09:00 ~ 18:00','18:00 ~ ','2,7','2022.10.26(수)~28(금)',1),
                    ('서울특별시 동대문구 경희대로 26','18:00 ~ 23:00','10:00 ~ 17:00','18:00 ~ 22:00','1','2022.09.28(수)~30(금)',2),
                    ('서울특별시 성동구 왕십리로 222','18:00~24:00','10:00~17:00','16:00~22:00','2','2022.10.05(수)~7(금)',3)
;

insert into Celebrity (singerName, singerImage, totalLiked) values
                    ('10cm', 'image.png', 1),
                    ('예빛', 'image.png', 10),
                    ('다이나믹듀오','https://www.google.com/url?sa=i&url=https%3A%2F%2Fm.blog.naver.com%2Fbkh4443%2F221401959538&psig=AOvVaw1dznLm-Ik9YwtozsbwsyVs&ust=1676268654367000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCPjJt7-pj_0CFQAAAAAdAAAAABAE',10),
                    ('비비','https://www.google.com/url?sa=i&url=https%3A%2F%2Fmobile.newsis.com%2Fview.html%3Far_id%3DNISX20221118_0002091664&psig=AOvVaw15gacvdx0tNdGAX9z0Fh5K&ust=1676268668404000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCIDLhcapj_0CFQAAAAAdAAAAABAE',10),
                    ('비와이','',10),
                    ('악동뮤지션','',10)
;

insert into SchoolCelebrity (CELEBRITY_ID, SCHOOL_ID) values
                    (1,2),
                    (1,2),
                    (3,1),
                    (4,1),
                    (5,1),
                    (6,1)
;

insert into FestivalReview (SCHOOL_ID, USER_ID, reviewContent, likedCount) values
                (1,1,'와 개쩐다', 0),
                (1,1,'와 개쩐다', 0),
                (1,1,'와 개쩐다', 0),
                (1,1,'와 개쩐다', 0)
;