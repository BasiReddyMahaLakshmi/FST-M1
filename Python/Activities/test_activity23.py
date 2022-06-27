import pytest


@pytest.fixture
def num_list():
    list = [0,1,2,3,4,5,6,7,8,9,10]
    return list


def test_sum(num_list):
    sum = 0
    for numbers in num_list:
       sum+=numbers
    assert sum == 55



