CREATE DATABASE IF NOT EXISTS ToDoApp;
USE ToDoApp;

CREATE TABLE IF NOT EXISTS work(
  id int(11) NOT NULL,
  title varchar(255) DEFAULT NULL,
  status smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng work
--

INSERT INTO work (id, title, status) VALUES
(1, 'Quét nhà', 0),
(2, 'Rửa bát', 1),
(3, 'Học bài', 1),
(4, 'Nấu cơm', 0),
(5, 'Chơi bóng rổ', 0),
(6, 'Giặt quần áo', 1),
(7, 'Dạy gia sư', 1),
(8, 'Đi siêu thị', 0),
(9, 'Đọc sách', 0),
(10, 'Học một ngôn ngữ mới', 1),
(11, 'Đan len', 1),
(12, 'Gọi điện thoại cho gia đình', 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng work
--
ALTER TABLE work
  ADD PRIMARY KEY (id);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng work
--
ALTER TABLE work
  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

