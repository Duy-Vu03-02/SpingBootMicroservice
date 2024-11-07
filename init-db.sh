#!/bin/bash
set -e

# Khởi tạo cơ sở dữ liệu
psql -U postgres -c "CREATE DATABASE inventory_db;"
psql -U postgres -c "CREATE DATABASE order_service;"

# Các lệnh SQL khác có thể được thêm vào đây nếu cần.
